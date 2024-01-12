package Main;

import Service.SaveStudentInform;
import Service.ScreenService;
import Service.SearchStudentInform;
import domain.Student;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScreenService screenService = new ScreenService();
        screenService.mainPage();
        String input = sc.nextLine();

        Student student = new Student("", "");
        SaveStudentInform saveStudentInform = new SaveStudentInform();
        SearchStudentInform searchStudentInform = new SearchStudentInform();

while(true){
        switch(input){
            case("1"):  saveStudentInform.saveStudentInform();
                break;
            case("2"):  searchStudentInform.searchStudentInform(student.getStudentId(), student.getStudentName());
                break;
            case("3"):
                break;
            case("4"):
                break;
            case("5"):
                break;
            default:
                break;
        }
    }





    }
}