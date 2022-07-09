class SuperKey {
    String fullName;

    SuperKey(String fullName){
        this.fullName = fullName;
    }

    String getName(){
        return "Joko";
    }

    public static void main(String[] args) {
        var names = new SuperName("Ahmed Abdullah");
        System.out.println("my name is "+names.getName());
        System.out.println("my name is "+names.getKeyName());
        System.out.println("my name is "+names.fullName);
    }
}

class SuperName extends SuperKey{

    //wajib override constructor dari class parent
    SuperName(String fullName) {
        super(fullName);
    }

    String getName(){
        return "Sastro";
    }

    //get method from parent class
    String getKeyName(){
        return super.getName();
    }
}