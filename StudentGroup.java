public void bubbleSort() {
  // Add your implementation here
               Student temp=students;
                for(int i=0;i<students.length;i++){
                    for(int j=i+1;j<students.length;j++){
                       temp[i] =students[i];
                        students[i]=students[i+1];
                        students[i+1]=temp[i];
                    }
                }
                
 }
 @Override
 public Student[] getByBirthDate(Date date) {
  // Add your implementation here
                ArrayList a=new ArrayList();
                try{
                if(date==null){
                    throw new IllegalArgumentException();
                }
                else{
                    for(int i=0;i<students.length;i++){
                        if(students[i].getBirthDate()==date){
                            a.add(students[i]);
                        }
                    }
                }
                }catch(IllegalArgumentException e){
                    System.out.println(e);
                }
  return a;
 }
 @Override
 public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
  // Add your implementation here
                ArrayList a=new ArrayList();
                try{
                    if(students==null){
                        throw new IllegalArgumentException();
                    }
                    else{
                 for(int i=0;i<students.length;i++){
                     if((students[i].getBirthDate()>firstDate)&&(students[i].getBirthDate()<lastDate)){
                         a.add(students[i]);
                     }
                     else{
                         throw new IllegalArgumentException();
                     }
                 }   
                }
                }
                catch(IllegalArgumentException e){
                    System.out.println(e);
                }
  return a;
 }
 @Override
 public Student[] getNearBirthDate(Date date, int days) {
  // Add your implementation here
                ArrayList a=new ArrayList();
                for(int i=0;i<students.length;i++){
                   Date d=students[i].getBirthDate();
                  int day1;
                    day1 = Days.BetweenDays(d,date);
                   if(days<day1){
                       a.add(students[i]);
                   }
                }
  return a;
 }
 @Override
 public int getCurrentAgeByDate(int indexOfStudent) {
  // Add your implementation here
                int y=0;
                try{
                if(indexOfStudent==0){
                    throw new IllegalArgumentException();
                }
                else{
                   Date h=students[indexOfStudent].getBirthDate();
                   Date g=new Date();
                   int year = h.getYear();  
                   int y1=g.getYear();
                   y=y1-year;
                }
                }catch(IllegalArgumentException e){
                    System.out.println(e);
                }
  return y;
 }
 @Override
 public Student[] getStudentsByAge(int age) {
  // Add your implementation here
                ArrayList a=new ArrayList();
                for(int i=0;i<students.length;i++){
                    Date h=students[i].getBirthDate();
                    int y=h.getYear();
                    if(age+y==2017){
                        a.add(students[i]);
                    }
                }
  return a;
 }