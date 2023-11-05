public class Main {
    public static void main(String[] args) {
        int ageAdult= 18;
        if (ageAdult>=18){
            System.out.println("Если возраст человека равен 18,то он совершеннолетний");}
        else {System.out.println("Если возраст человека не равен 18, он не достиг совершеннолетия,нужно немного подождать");}
        int temperature=3;
        if (temperature<5){
            System.out.println("На улице холодно, нужно надеть шапку");}
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");}
        int speedLimitKilometersInHour=29;
        if (speedLimitKilometersInHour>60){
            System.out.println("Ecли скорость больше 60 киллометров в час, то придется заплатить штраф");}
        else {
            System.out.println("Если скорость меньше 60 киллометров в час ,можно ездить спокойно");}
        int age= 43;
        if (age <=6 && age >=2){
            System.out.println("Если возраст человека равен от 2 до 6 лет , то ему нужно ходить в детский сад");}
        if (age<=17&& age >= 7){
            System.out.println("Если возраст человека равен от 17 до 7 лет , то ему нужно ходить в школу");}
        if (age <=24&& age >=18){
            System.out.println("Если возраст человека равен от 24 до 18 лет , то ему место в университете");}
        if (age>24){
            System.out.println("Если возраст человека более 24 лет, то ему пора ходить на работу");}
        int childAge=9;
        if (childAge<5){
            System.out.println("Если возраст ребенка меньше 5лет,то ему нельзя кататься на аттракционе");}
        if (childAge>=5&&childAge<=14){
            System.out.println("Если возраст ребенка от 5 до 14 ,  то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");}
        if (childAge>14){
            System.out.println("Если возраст ребенка больше 14 лет, то он может кататься без сопровождения взрослого");}
        int capacity=4;
        if (capacity<60){
            System.out.println("В вагоне есть сидячие места");}
        if (capacity>60&& capacity<102){
            System.out.println("В вагоне есть стоячие места");}
        else{ System.out.println("В вагоне мест нет");}
        int one=1;
        int two=2;
        int three=3;
        if(one>two){
            System.out.println("Наибольшее число one");}
        else if(two>three){
            System.out.println("Наибольшее число two");}
        else System.out.println("Наибольшее число three");
    }
}