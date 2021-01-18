public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private String energyCore;
    private float height;

    public Jaeger(String modelName, String mark, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
    }

    public Jaeger(String modelName, String mark, String origin, String energyCore) {
        this(modelName, mark, origin);
        this.energyCore = energyCore;
    }

    public Jaeger(String modelName, String mark, String origin, String energyCore, float height) {
        this(modelName, mark, origin, energyCore);
        if (height <= 0) {
            System.out.println("Высота не может быть меньше нуля");
        } else {
            this.height = height;
        }
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public String getEnergyCore() {
        return energyCore;
    }

    public float getHeight() {
        return height;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public String activateWeapon() {
        return "Оружие активировано";
    }

    @Override
    public String toString() {
        return "Model Name: " + getModelName() + "\n" + "Mark: " + getMark() + "\n" + "Origin: " + getOrigin() + "\n" ;
    }
}