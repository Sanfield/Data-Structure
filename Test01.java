import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student{
    public String name;
    public int score;
    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

}
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int stuCount = sc.nextInt();
            int option = sc.nextInt();
            ArrayList<Student> arrayList = new ArrayList<>();
            for (int i = 0; i < stuCount; i++) {
                arrayList.add(new Student(sc.next(),sc.nextInt()));
            }
            if (option == 0){
                Collections.sort(arrayList, new Comparator<Student>() {
                    <a href="/profile/992988" data-card-uid="992988" class="js-nc-card" target="_blank" style="color: #25bb9b">@Override
                    public int compare(Student o1, Student o2) {
                        return o2.score-o1.score;
                    }
                });

            }
            if (option == 1){
                Collections.sort(arrayList, new Comparator<Student>() {
                    </a><a href="/profile/992988" data-card-uid="992988" class="js-nc-card" target="_blank" style="color: #25bb9b">@Override
                    public int compare(Student o1, Student o2) {
                        return o1.score-o2.score;
                    }
                });
            }
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i).name+" "+arrayList.get(i).score);
            }
            arrayList.clear();
        }
    }
}