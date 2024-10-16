public class Aquatic extends Animal{
    protected String habitat;

    public Aquatic() {

        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {

        super(family, name, age, isMammal);
        this.habitat = habitat;

    }

    public String getHabitat() {

        return habitat;
    }
    public void  setHabitat(String habitat) {

        this.habitat = habitat;
    }
    @Override
    public String toString(){
        return "Aquatic " + getName() + " " + getAge() + " " + getFamily() + " " + isMammal() + " habitat: " + getHabitat();
    }
    public void swim (){

        System.out.println("This aquatic animal is swimming. ");
    }
}

