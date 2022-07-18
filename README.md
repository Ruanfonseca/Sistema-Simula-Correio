# SistemaSend
Utilizando o Mailhog para envio de email 

O sistema consiste em simulação de envio de mensagens por email utilizando o mailhog como servidor smtp.Com a API java mail o sistema simula o envio e recebimento de emails.

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


