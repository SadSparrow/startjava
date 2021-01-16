public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private String energyCore;
    private float height;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (getModelName() == null) {
            this.modelName = modelName;
        } else {
            System.out.println("Ошибка! Model Name уже инициализировано: " + getModelName());
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getEnergyCore() {
        return energyCore;
    }

    public void setEnergyCore(String energyCore) {
        this.energyCore = energyCore;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height <= 0) {
            System.out.println("Высота не может быть меньше нуля");
        } else {
            this.height = height;
        }
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