# Simulação de funcionamento de um correio eletrônico com JavaMail
Utilizando o Mailhog para envio de email 

O sistema consiste em uma simulação de envio de mensagens por email utilizando o mailhog como servidor smtp.Com a API java mail o sistema simula o envio e recebimento de emails,para o frontend a utilização do jsf.

Para testes foi utilizado o wildfly+24 com a seguinte configuração em seu xml 
<system-properties>
        <property name="emailproject.mail.smtp.host" value="localhost"/>
        <property name="emailproject.mail.smtp.port" value="1025"/>
        <property name="emailproject.mail.from" value="fonsecacodingpro@gmail.com"/>
    </system-properties>

onde o "fonsecacondingpro@gmail.com" foi somente um email de exemplo de remetente.


PASSO A PASSO para ver o funcionamento em sua maquina.
1)Instale a versão mais atual do Wildfly 
2)Configure o servidor no eclipse
3)digite abaixo da tag extensions o seguinte código 
  <system-properties>
        <property name="emailproject.mail.smtp.host" value="localhost"/>
        <property name="emailproject.mail.smtp.port" value="1025"/>
        <property name="emailproject.mail.from" value= ... /> 
    </system-properties>
 digite onde esta os 3 pontos um email de sua escolha
4)Execute o MailHog 
5)Execute o programa no servidor 



SEGUE ABAIXO ALGUMAS CAPTURAS DO FUNCIONAMENTO DO SISTEMA 



![Frame1](https://user-images.githubusercontent.com/64973978/179617972-09bedbd7-658c-4b65-8d3f-63b844add459.png)

![frame2](https://user-images.githubusercontent.com/64973978/179617997-5ba792e7-37ed-44e7-99b1-c078eb043276.png)

![frame3](https://user-images.githubusercontent.com/64973978/179618034-54cf18de-faf3-43ac-9f2c-54cedfcfa435.png)


![frame4](https://user-images.githubusercontent.com/64973978/179618059-ccdbf136-768f-47af-8aa9-1a3b57e6e149.png)


![frame5](https://user-images.githubusercontent.com/64973978/179618084-264a3cc2-f70f-43fe-b7cd-faa75a8049cf.png)



