package com.example.basicinfojava;

import java.net.InetAddress;
import java.net.UnknownHostException;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Response {

  private String method;
  private String url;
  private String browser;
  private final String user = System.getProperty("user.name");
  private final OS os = new OS();

  @Getter
  public class OS {

    private final String hostname;
    private final String architecture = System.getProperty("os.arch");
    private final String platform = System.getProperty("os.name");
    private final String release = System.getProperty("os.version");

    private OS() {
      String hostname = null;

      try {
        hostname = InetAddress.getLocalHost().getHostName();
      } catch (UnknownHostException e) {}

      this.hostname = hostname;
    }

  };

}
