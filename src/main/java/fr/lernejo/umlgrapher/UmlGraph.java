package fr.lernejo.umlgrapher;

public class UmlGraph {
    private final Class name;
    public UmlGraph(Class value) {
        this.name = value;
    }
    public String as(GraphType typegraph) {
        String insert = "classDiagram\n";
        if (typegraph == GraphType.Mermaid) {
            insert += this.name.getClass().getSimpleName().toLowerCase()  + " " + this.name.getSimpleName();
            if (this.name.isInterface()) {
                insert += " {\n" + "    <<interface>>";
                insert += "\n}\n";}
        }
        return insert;
    }
}
