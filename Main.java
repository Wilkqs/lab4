
/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();

      Scanner scan = new Scanner(System.in);
      while (true) {
        System.out.println(" 1. dodaj studenta");
        System.out.println(" 2. wyswietl liste");
        System.out.println(" 3. wyjdz z programu");
        int wybor = scan.nextInt();
        scan.nextLine();

        switch (wybor) {
          case 1: {
            System.out.println("Podaj imie");
            String name = scan.nextLine();
            System.out.println("Podaj nazwisko");
            String nazwisko = scan.nextLine();
            System.out.println("Podaj wiek");
            int age = scan.nextInt();
            System.out.println("Podaj date urodzenia");
            String data = scan.next();
            s.addStudent(new Student(name, nazwisko, age, data));
          }
            break;

          case 2: {

            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
          }
            break;
          case 3:{
            return;
          }
        }
      }
    } catch (IOException e) {

    }
  }
}
