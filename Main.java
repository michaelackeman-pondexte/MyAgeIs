class CheckMyAge {
  public static void main(String[] args) {
    
    int myAge= 15;
    int myBirthday= 728;
    int todaysDate= 921; 

    if(myBirthday == todaysDate){ 
       myAge= myAge + 1;
       System.out.println("I am " + myAge + " years old");
      } else{
       System.out.println("I am still " + myAge + "years old");
     }


  }
}