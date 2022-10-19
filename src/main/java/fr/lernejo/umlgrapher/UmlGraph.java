package fr.lernejo.umlgrapher;
public class UmlGraph {
    private final Class[] name;
    public UmlGraph(final Class ... Nameclass){
        this.name = Nameclass;
    }
    public String as(GraphType typegraph) {
        StringBuilder insert = new StringBuilder("classDiagram\n");
        for(Class graphname: name) {
            if (typegraph == GraphType.Mermaid) {
                insert.append(graphname.getClass().getSimpleName().toLowerCase()).append(" ").append(graphname.getSimpleName()).append(" {\n");
                if (graphname.isInterface()) {
                    insert.append("    <<interface>>\n");
                    insert.append("}\n");}
            }
        }
        return insert.toString();}
}
