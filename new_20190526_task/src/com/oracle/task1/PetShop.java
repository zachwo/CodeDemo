package com.oracle.task1;

public class PetShop {
    private Pet[] pets;
    int index;

    public PetShop(int length) {
        if (length>0){
            pets = new Pet[length];
        }else{
            pets = new Pet[1];
        }
        index = 0;
    }

    public void addPet(Animal animal){
        if (isPet(animal)){
            if (index<pets.length){
                pets[index] = (Pet) animal;
            }else {
                Pet[] newPets = new Pet[pets.length+1];
                for (int i = 0; i<pets.length;i++){
                    newPets[i] = pets[i];
                }
                newPets[newPets.length-1] = (Pet) animal;
                pets = newPets;
            }
            index++;
        }else{
            //System.out.println(animal.getAnimalType()+"不是宠物，不能保存在宠物商店");
        }
    }

    public boolean isPet(Animal animal){
        if (animal.getAnimalType().equals("猫")||animal.getAnimalType().equals("狗")){
            return true;
        }else{
            return false;
        }
    }

    public void showPets(){
        for (int i = 0;i<pets.length;i++){
            if(pets[i] instanceof Cat){
              Cat cat =  (Cat)pets[i];
              cat.showInfo();
            }else{
                Dog dog = (Dog)pets[i];
                dog.showInfo();
            }
        }
    }

    public void searchPet(String name,String color){
        boolean flag = true;
        for (int i = 0;i<pets.length;i++){
            if (pets[i] instanceof Cat){
                Cat cat =  (Cat)pets[i];
                if (cat.getName().equals(name)&&cat.getColor().equals(color)){
                    System.out.println("您的宠物信息已查到：");
                    cat.showInfo();
                    flag = false;
                }
            }else  {
                Dog dog =  (Dog)pets[i];
                if (dog.getName().equals(name)&&dog.getColor().equals(color)){
                    System.out.println("您的宠物信息已查到：");
                    dog.showInfo();
                    flag = false;
                }
            }
        }
        if (flag){
            System.out.println("没有查到该宠物信息");
        }
    }
}
