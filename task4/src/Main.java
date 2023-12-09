import Adapter.*;

public class Main {
    public static void main(String[] args) {
        SourceProtocol httpProtocol = new HttpProtocol();
        TargetProtocolAdapter httpAdapter = new ProtocolAdapter(httpProtocol);

        httpAdapter.connect();
        httpAdapter.sendData("Data for HTTP");
        String httpResponse = httpAdapter.receiveData();
        System.out.println("Received response: " + httpResponse);
        httpAdapter.disconnect();

        SourceProtocol ftpProtocol = new FtpProtocol();
        TargetProtocolAdapter ftpAdapter = new ProtocolAdapter(ftpProtocol);

        ftpAdapter.connect();
        ftpAdapter.sendData("Data for FTP");
        String ftpResponse = ftpAdapter.receiveData();
        System.out.println("Received response: " + ftpResponse);
        ftpAdapter.disconnect();

        SourceProtocol smtpProtocol = new SmtpProtocol();
        TargetProtocolAdapter smtpAdapter = new ProtocolAdapter(smtpProtocol);

        smtpAdapter.connect();
        smtpAdapter.sendData("Data for SMTP");
        String smtpResponse = smtpAdapter.receiveData();
        System.out.println("Received response: " + smtpResponse);
        smtpAdapter.disconnect();
    }
}
