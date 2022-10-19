package fr.lernejo.umlgrapher;
import picocli.CommandLine;
import picocli.CommandLine.Option;

public class Launcher implements Runnable {
    @Option(names = { "-c", "--classes"}, required = true, description = "Give Class")
    private final Class Classrecept = UmlGraph.class;

    @Option(names = { "-g", "--graph-type" }, description = "Give type of graph")
    private final GraphType typeofgraph = GraphType.Mermaid;


    public static void main(String... args) {
        int exitcode = new CommandLine(new Launcher()).execute(args);
        System.exit(exitcode);
        //CommandLine.usage(new Launcher(),System.out);
    }

    @Override
    public void run() {
        UmlGraph graphrun  = new UmlGraph(Classrecept);
        String result = graphrun.as(typeofgraph);
        System.out.println(result);
    }
}

