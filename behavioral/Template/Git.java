package behavioral.Template;

public class Git {
    private String name;
    private String project;
    private String id;
    public Git(String name, String project, String id) {
        this.name = name;
        this.project = project;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getProject() {
        return project;
    }
    public String getId() {
        return id;
    }

    
}
