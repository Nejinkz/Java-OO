import javax.swing.JOptionPane; 
public class exercicio_10 { 
public static void main(String[] args) { 
int cabelo, olho, idade, sexo, decisao, contOlho,contCabelo,olhocabelo; 
float altura, peso, mediaIdade, mediaPeso, mediaAltura, AcumAltura, AcumIdade,AcumPeso,contMulher,contHomem,contPart; 
double porcMulher, porcHomem, porcTotal; 
porcTotal=0; 
olho=0; 
cabelo=0; 
sexo=0; 
contPart=0; 
decisao=1; 
mediaIdade=0; 
mediaPeso=0; 
mediaAltura=0; 
porcMulher=0; 
porcHomem=0; 
AcumIdade=0; 
AcumAltura=0; 
AcumPeso=0; 
contMulher=0; 
contHomem=0; 
olhocabelo=0; 
while (decisao==1){ 
sexo=Integer.parseInt(JOptionPane.showInputDialog("Informe o sexo\n1 - Masculino\n2 - Feminino")); 
switch (sexo){ 
case 1: 
olho=Integer.parseInt(JOptionPane.showInputDialog("Informe a cor dos olhos\n1 - Azuis\n2 - Verdes\n3 - Castanhos")); 
while (olho!=1 && olho!=2 && olho!=3){ 
JOptionPane.showMessageDialog(null,"Valor inserido para os olhos Inválido\nInsira Novamente"); 
olho=Integer.parseInt(JOptionPane.showInputDialog("Informe a cor dos olhos\n1 - Azuis\n2 - Verdes\n3 - Castanhos")); 
} 
cabelo=Integer.parseInt(JOptionPane.showInputDialog("Insira a cor dos cabelos\n1 - Louros\n2 - Castanhos\n3 - Pretos")); 
while (cabelo!=1 && cabelo!=2 && cabelo!=3){ 
JOptionPane.showMessageDialog(null,"Valor inserido para o cabelo Inválido\nInsira Novamente"); 
cabelo=Integer.parseInt(JOptionPane.showInputDialog("Insira a cor dos cabelos\n1 - Louros\n2 - Castanhos\n3 - Pretos")); 
} 
idade=Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade")); 
AcumIdade=AcumIdade+idade; 
altura=Float.parseFloat(JOptionPane.showInputDialog("Insira a Altura")); 
while (altura<0.20){ 
JOptionPane.showMessageDialog(null,"Valor inserido para a altura Inválido\nInsira Novamente"); 
altura=Float.parseFloat(JOptionPane.showInputDialog("Insira a Altura")); 
} 
AcumAltura=AcumAltura+altura; 
peso=Float.parseFloat(JOptionPane.showInputDialog("Informe o peso")); 
AcumPeso=AcumPeso+peso; 
contHomem++; 
break; 
case 2: 
contMulher++; 
olho=Integer.parseInt(JOptionPane.showInputDialog("Informe a cor dos olhos\n1 - Azuis\n2 - Verdes\n3 - Castanhos")); 
while (olho!=1 && olho!=2 && olho!=3){ 
JOptionPane.showMessageDialog(null,"Valor inserido para os olhos Inválido\nInsira Novamente"); 
olho=Integer.parseInt(JOptionPane.showInputDialog("Informe a cor dos olhos\n1 - Azuis\n2 - Verdes\n3 - Castanhos")); 
} 
cabelo=Integer.parseInt(JOptionPane.showInputDialog("Insira a cor dos cabelos\n1 - Louros\n2 - Castanhos\n3 - Pretos")); 
while (cabelo!=1 && cabelo!=2 && cabelo!=3){ 
JOptionPane.showMessageDialog(null,"Valor inserido para o cabelo Inválido\nInsira Novamente"); 
cabelo=Integer.parseInt(JOptionPane.showInputDialog("Insira a cor dos cabelos\n1 - Louros\n2 - Castanhos\n3 - Pretos")); 
} 
idade=Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade")); 

AcumIdade=AcumIdade+idade; 
altura=Float.parseFloat(JOptionPane.showInputDialog("Insira a Altura")); 
while (altura<0.20){ 
JOptionPane.showMessageDialog(null,"Valor inserido para a altura Inválido\nInsira Novamente"); 
altura=Float.parseFloat(JOptionPane.showInputDialog("Insira a Altura")); 
} 
AcumAltura=AcumAltura+altura; 
peso=Float.parseFloat(JOptionPane.showInputDialog("Informe o peso")); 
AcumPeso=AcumPeso+peso; 
break; 
default: JOptionPane.showMessageDialog(null,"Sexo Inserido Inválido\nInsira Novamente"); 

} 
if (sexo==1 || sexo==2){ 
decisao=Integer.parseInt(JOptionPane.showInputDialog("Deseja Continuar?\n1 - Sim\n2 - Não")); 
if ((sexo==1||sexo==2) && olho==2 && cabelo==1 ){ 
olhocabelo++; 
} 
contPart=contHomem+contMulher; 
while (decisao!=1 && decisao!=2){ 
JOptionPane.showMessageDialog(null,"Valor inserido para a decisao Inválido\nInsira Novamente"); 
decisao=Integer.parseInt(JOptionPane.showInputDialog("Deseja Continuar?\n1 - Sim\n2 - Não")); 
} 
} 
} 
if (contPart>0){ 
porcTotal=contPart; 
mediaIdade=AcumIdade/contPart; 
JOptionPane.showMessageDialog(null,"A Média de idade dos participantes é = "+mediaIdade); 
mediaAltura=AcumAltura/contPart; 
JOptionPane.showMessageDialog(null,"A Média de altura dos participantes é = "+mediaAltura); 
mediaPeso=AcumPeso/contPart; 
JOptionPane.showMessageDialog(null,"A Média de peso dos participantes é = "+mediaPeso); 
porcMulher= (contMulher * 100) / porcTotal; 
JOptionPane.showMessageDialog(null,"A porcentagem de Mulhere no total dos participante é = "+porcMulher+"%"); 
porcHomem= (contHomem * 100) / porcTotal; 
JOptionPane.showMessageDialog(null,"A porcentagem de Homens no total dos participante é = "+porcHomem+"%"); 
JOptionPane.showMessageDialog(null,"A quantidade de participantes de olhos verdes e cabelos louros é = "+olhocabelo); 
} 
} 
} 