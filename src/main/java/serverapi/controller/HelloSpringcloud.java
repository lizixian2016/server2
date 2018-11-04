package serverapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloSpringcloud {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/hello")
	public String hello(HttpSession session) {
		String msg = String.format("服务提供客户端\t%s%s", "数据服务器", port);
		System.out.println(msg);

		System.out.printf(session.getId());
		return msg;
	}

}
