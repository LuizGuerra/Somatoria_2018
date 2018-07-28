public class Logic01{
    public void somatoria(){
        int x, soma1=0, soma2=0;
        int cont=0, contMax=0, numMax=0;
        int aquilo = 50000, num;
        String somatoria="--- ";
        String somatoriaMax= "--- ";
        for(num=1; num<=aquilo; num++){
            porcentagem(aquilo, num);
            for(x=1;x<=num;x++){
                    for(soma1=x; soma2<=num; soma1++){  
                    soma2=soma2+soma1;
                    if(soma2==num){
                        cont++; break;
                    }
                }
                soma2=0;
            }
            if(contMax<cont){  
                contMax=cont;
                numMax=num;
            }
            cont=0;
            somatoria= "--- \n";
        }
        somatoriaMax = "\fO maior número de somatórias possíveis são: " + contMax + ", do número " + numMax +
                    ". As somatórias dele são: \n" + somatorio(numMax);
        System.out.println(somatoriaMax);
    }
    public void porcentagem(int aquilo, int num){
        double x=(100*num/aquilo);
        int y=((int)x/10);
        double z=(100*num/aquilo);
        System.out.print("\f");
        switch(y){
            case 0:  System.out.println("[①②③④⑤⑥⑦⑧⑨⑩]"); break;
            case 1:  System.out.println("[❶②③④⑤⑥⑦⑧⑨⑩]"); break;
            case 2:  System.out.println("[❶❷③④⑤⑥⑦⑧⑨⑩]"); break;
            case 3:  System.out.println("[❶❷❸④⑤⑥⑦⑧⑨⑩]"); break;
            case 4:  System.out.println("[❶❷❸❹⑤⑥⑦⑧⑨⑩]"); break;
            case 5:  System.out.println("[❶❷❸❹❺⑥⑦⑧⑨⑩]"); break;
            case 6:  System.out.println("[❶❷❸❹❺❻⑦⑧⑨⑩]"); break;
            case 7:  System.out.println("[❶❷❸❹❺❻❼⑧⑨⑩]"); break;
            case 8:  System.out.println("[❶❷❸❹❺❻❼❽⑨⑩]"); break;
            case 9:  System.out.println("[❶❷❸❹❺❻❼❽❾⑩]"); break;
            case 10: break; //System.out.println("[❶❷❸❹❺❻❼❽❾❿]"); break;
        }
        if(y<10){
            System.out.println("\t"+z+"%");
            System.out.println("\n\nNúmero atual: " + num);
        }
    }
    public static String somatorio(int num){
        int x=1, soma1=0, soma2=0;
        String somei = " --- ";
        while(x<=num){ 
            while (soma2<=num){
                soma1++;
                soma2=soma1+soma2;
                if (soma2==num){
                    soma1=x; soma2=0;
                    while (soma2 <= num){
                        somei = somei + ("-" + soma1);
                        soma1++;
                        soma2=soma1+soma2;
                    } // this shit is LIT SHIT
                    somei = somei + " --- \n";
                }
            }
            x++;
            soma1=(x-1);
            soma2=0;
        }
        return somei;
    }
}