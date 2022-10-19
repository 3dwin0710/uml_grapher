package fr.lernejo.umlgrapher;
public class UmlGraph {
    private final Class[] name;
    public UmlGraph(final Class ... Nameclass){
        this.name = Nameclass;
    }
    public String as(GraphType typegraph) {
        String insert = "classDiagram\n";
        for(Class graphname: name) {
            if (typegraph == GraphType.Mermaid) {
                insert += "class" + " " + graphname.getSimpleName();
                if (graphname.isInterface()) {
                    insert += " {\n" + "    <<interface>>";
                    insert += "\n}\n";}
            }
        }
        return insert;}
}
