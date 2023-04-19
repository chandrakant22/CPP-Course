#include <iostream>

using namespace std;

class Student
{
    int roll;
    string name;
    float p1,p2,p3;

    public:

    Student(){
      cout<<"hello i am const"<<endl;
      roll=99;
      name="not set";
      p1=p2=p3=0;
      //setData();
      //show();
    }

    Student(int r){
      cout<<"hello i am 1 Para const"<<endl;
      roll=r;
      name="not set";
      p1=p2=p3=0;
    }

    /*Student(string n){
      cout<<"hello i am 1 string Para const"<<endl;
      roll=0;
      name=n;
      p1=p2=p3=0;
    }

   Student(int r,string n){
      cout<<"hello i am 2 Para const"<<endl;
      roll=r;
      name=n;
      p1=p2=p3=0;
    }*/


    void setData()
    {
        cout<<"Enter Roll :";
        cin>>roll;
        cout<<"Enter Name :";
        cin>>name;
        cout<<"Enter Paper 1 :";
        cin>>p1;
        cout<<"Enter Paper 2 :";
        cin>>p2;
        cout<<"Enter Paper 3 :";
        cin>>p3;
    }

    void show()
    {

        cout<<"Roll "<<roll<<endl;
        cout<<"Name "<<name<<endl;
        cout<<"Result "<<p1+p2+p3<<endl;

    }

};



int main()
{
  Student s;
  //,s1(101,"geeta");
  //Student s2(22),s3(77),s4("ram");
  cout<<"hello world"<<endl;
  //s.setData();
  //s1.setData();
  s.show();
  //s1.show();
  //s2.show();
  //s3.show();
  //s4.show();


    return 0;
}
