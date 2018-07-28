public class appDeTestes{
    public static void main(String args[]){
        System.out.println("\f"+somatoria());
    }
        public static String somatoria(){
        int x, soma1=0, soma2=0;
        int cont=0, contMax=0, numMax=0;
        int num;
        String somatoria="--- ";
        String somatoriaMax= "--- ";
        for(num=1; num<=50000; num++){
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
        somatorio(numMax);
        soma2=0;
        somatoriaMax = "O maior número de somatórias possíveis são: " + contMax + ", do número " + numMax +
                        ". As somatórias dele são: \n" + somatorio(numMax);
                        
        return somatoriaMax;
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