import java.util.Scanner;

//백준 2456번
public class Q2456_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stdNum = scan.nextInt();
        int a, b, c;
        int aScore = 0, bScore = 0, cScore = 0;
        int a3Count = 0, b3Count = 0, c3Count = 0;
        int a2Count = 0, b2Count = 0, c2Count = 0;
        for (int i=0 ; i<stdNum ; i++){
            a = scan.nextInt();
            if(a == 3){
                a3Count += 1;
            }else if(a == 2){
                a2Count += 1;
            }
            aScore += a;

            b = scan.nextInt();
            if(b == 3){
                b3Count += 1;
            }else if(a == 2){
                b2Count += 1;
            }
            bScore += b;

            c = scan.nextInt();
            if(c == 3){
                c3Count += 1;
            }else if(a == 2){
                c2Count += 1;
            }
            cScore += c;
        }


        //비교
        if(aScore > bScore){
            //a > b
            if(aScore > cScore){
                //a > b,c
                System.out.print("1 " + aScore);
            }else if(aScore < cScore){
                //c > a > b
                System.out.print("3 " + cScore);
            }else{
                //a = c > b
                if(a3Count > c3Count){
                    System.out.print("1 " + aScore);
                }else if(a3Count < c3Count){
                    System.out.print("3 " + cScore);
                }else{
                    if(a2Count > c2Count){
                        System.out.print("1 " + aScore);
                    }else if(a2Count < c2Count){
                        System.out.print("3 " + cScore);
                    }else{
                        System.out.print("0 " + aScore);
                    }
                }
            }
        }

        else if(aScore < bScore){
            //a < b
            if(bScore > cScore){
                //b > a,c
                System.out.print("2 " + bScore);
            }else if(bScore < cScore){
                //c > b > a
                System.out.print("3 " + cScore);
            }else{
                //b = c > a
                if(b3Count > c3Count){
                    System.out.print("2 " + bScore);
                }else if(b3Count < c3Count){
                    System.out.print("3 " + cScore);
                }else{
                    if(b2Count > c2Count){
                        System.out.print("2 " + bScore);
                    }else if(b2Count < c2Count){
                        System.out.print("3 " + cScore);
                    }else{
                        System.out.print("0 " + bScore);
                    }
                }
            }
        }

        else{              //a == b
            if(aScore < cScore){
                //c > a = b
                System.out.print("3 " + cScore);
            }else if(aScore > cScore){
                //a = b > c
                if(a3Count > b3Count){
                    System.out.print("1 " + aScore);
                }else if(a3Count < b3Count){
                    System.out.print("2 " + bScore);
                }else{
                    if(a2Count > b2Count){
                        System.out.print("1 " + aScore);
                    }else if(a2Count < b2Count){
                        System.out.print("2 " + bScore);
                    }else{
                        System.out.print("0 " + aScore);
                    }
                }
            }else{          //a = b = c
                if(a3Count > b3Count){
                    if(a3Count > c3Count){
                        System.out.print("1 " + aScore);
                    }else if(a3Count < c3Count){
                        System.out.print("3 " + cScore);
                    }else{
                        if(a2Count > c2Count){
                            System.out.print("1 " + aScore);
                        }else if(a2Count < c2Count){
                            System.out.print("3 " + cScore);
                        }else{
                            System.out.print("0 " + aScore);
                        }
                    }
                }else if(a3Count < b3Count){
                    if(b3Count > c3Count){
                        System.out.print("2 " + bScore);
                    }else if(b3Count < c3Count){
                        System.out.print("3 " + cScore);
                    }else{
                        if(b2Count > c2Count){
                            System.out.print("2 " + bScore);
                        }else if(b2Count < c2Count){
                            System.out.print("3 " + cScore);
                        }else{
                            System.out.print("0 " + bScore);
                        }
                    }
                }else{          //a3 == b3
                    if(a3Count < c3Count){
                        System.out.print("3 " + cScore);
                    }else if(a3Count > c3Count){
                        if(a2Count > b2Count){
                            System.out.print("1 " + aScore);
                        }else if(a2Count < b2Count){
                            System.out.print("2 " + bScore);
                        }else{
                            System.out.print("0 " + aScore);
                        }
                    }else{     //a3 == b3 == c3
                        if(a2Count > b2Count){
                            if(a2Count > c2Count){
                                System.out.print("1 " + aScore);
                            }else if(a2Count < c2Count){
                                System.out.print("3 " + cScore);
                            }else{
                                System.out.print("0 " + aScore);
                            }
                        }else if(a2Count < b2Count) {
                            if(b2Count > c2Count){
                                System.out.print("2 " + bScore);
                            }else if(b2Count < c2Count){
                                System.out.print("3 " + cScore);
                            }else{
                                System.out.print("0 " + bScore);
                            }
                        }else{
                            //a3 = b3 = c3 / a2 = b2
                            if(a2Count > c2Count){
                                System.out.print("0 " + aScore);
                            }else if(a2Count < c2Count){
                                System.out.print("3 " + cScore);
                            }else{
                                System.out.print("0 " + aScore);
                            }
                        }
                    }
                }
            }
        }
    }
}
