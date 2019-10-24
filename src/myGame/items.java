package myGame;

public class items {
    private int wood = 0;
    private int steel = 0;
    private int tools = 0;

    public items() {

    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getSteel() {
        return steel;
    }

    public void setSteel(int steel) {
        this.steel = steel;
    }

    public int getTools() {
        return tools;
    }

    public void setTools(int tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "items{" +
                "wood=" + wood +
                ", steel=" + steel +
                ", tools=" + tools +
                '}';
    }
}
