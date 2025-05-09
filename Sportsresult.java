interface student
{
int score=10;
void displayscore();
}
interface sports
{
int score=25;
void displaysports();
}
class result implements student,sports
{
public void displayscore()
{
System.out.println("Academic score is"+student.score);
}
public void displaysports(){

System.out.println("Sports score is "+sports.score);
}
}
public class Sportsresult
{
public static void main(String[] args)
{
result r = new result();
r.displayscore(); r.displaysports();
}
}
