 #include <stdio.h>
 #include <conio.h>
 main()
 { //net sal
  int basic, net_salary;
  int allowance, deduction;
  clrscr();

    printf("Enter basic salary: ");
    scanf("%d",&basic);

    allowance=basic*0.8;

    //printf("\nEnter amount of allowances: ");
    //scanf("%d",&allowance);
    deduction=basic*0.2;
    //printf("\nElnter amount of deductions:");
    //scanf("%d",&deduction);

    net_salary=basic+allowance-deduction;  //5500+100-200=5400
    printf("\nnet salary: %d",net_salary);

  getch();
  return 0;
 }
