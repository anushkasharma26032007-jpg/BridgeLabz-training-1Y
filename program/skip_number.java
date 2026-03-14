class skip_number{
public static void main(String[] args){
int n=10;
for(int i=1;i<=n;i++){
if(i%2==0){
continue;
}else{
System.out.println(i);
}
}
}
}