package com.kh.academy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AcademyApplication.class);
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> refs/remotes/origin/main
