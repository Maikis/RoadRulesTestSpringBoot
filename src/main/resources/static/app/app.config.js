(function(angular) {
	'use-strict';
	
	angular
		.module('rules-test')
		.config(function($httpProvider) {
		  
		  $httpProvider.defaults.headers.common["X-Requested-With"] = 
			  'XMLHttpRequest';
	
	  	})	
		.config(function($stateProvider, $urlRouterProvider) {
	
			$urlRouterProvider.otherwise("/login/main");
		
			$stateProvider
				.state('login', {
					url: "/login",
					templateUrl: "loginPage.tmpl.html"
				})
				.state('login.main', {
					url: "/main",
					templateUrl: "app/welcomeTmpl/welcome.tmpl.html"
				})
				.state('login.register', {
					url: "/register",
					templateUrl: "app/register/register.tmpl.html"
				})
				.state('user', {
					url: "/user",
					templateUrl: "userPage.tmpl.html"
				})
				.state('user.testb', {
					url: "/testb",
					templateUrl: "app/testB/testB.tmpl.html"
				});
		});
	
})(window.angular)