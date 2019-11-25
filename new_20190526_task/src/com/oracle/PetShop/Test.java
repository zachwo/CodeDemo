package com.oracle.PetShop;

public class Test {
    public static void main(String[] args) {
        PetShop petShop = new PetShop(2);
        Animal[] animals = {new Cat("加菲","姜黄色"),new Dog("布鲁托","金色"),
                new Snake("小青","青色"),new Cat("汤姆","灰色"),
                new Dog("萨吉摩","白色")};

        for (int i = 0;i<animals.length;i++){
            petShop.addPet(animals[i]);
        }
        System.out.println("宠物寄存名录如下：");
        petShop.showPets();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        petShop.searchPet("加菲","姜黄色");
        System.out.println();
        petShop.searchPet("小青","青绿色");


    }

}
