<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">

<%@ include file="/common/header.jsp"%>
<%@ include file="/common/taglibs.jsp"%>
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

</head>
<body>
	<div class="wrapper">
		
	
	
		<div class="row">
			<div class="col-sm-12 row-center">
				<h4>天津港散杂货费收综合信息平台</h4>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 row-center">
				<div class="list-block">
					<ul>
						<li>
							<div class="item-content" >
								<div class="col-xs-2 col-sm-2 col-center" >
									<i class="fa fa-file-text text-red fa-size"></i>
							    </div>
								<div class=" col-xs-6 col-sm-6">
									<p class="item_title">发票1</p>
						        	<h4>查看发票1</h4>
					        	</div>
					        	<div class="col-xs-4 col-sm-4">
					        		<a href="${ctxSmartBI}resid=I8a000d370156c0a7c0a7a22d0156d4e1dae569d9${ctxSmartBIUser}">
					        			<i class="fa fa-angle-right fa-size"></i>
					        		</a>
					        	</div>
							</div>
						</li>
					</ul>
					<ul>
						<li >
							<div class="item-content" >
								<div class="col-xs-2 col-sm-2 col-center" >
									<i class="fa fa-file-text text-red fa-size"></i>
							    </div>
								<div class=" col-xs-6 col-sm-6">
									<p class="item_title">二类发票</p>
						        	<h4>查看二类发票</h4>
					        	</div>
					        	<div class="col-xs-4 col-sm-4">
					        		<a href="${ctxSmartBI}resid=I8a000d370156c0a7c0a7a22d0156d4e1dae569d9${ctxSmartBIUser}">
					        			<i class="fa fa-angle-right fa-size"></i>
					        		</a>
					        	</div>
							</div>
						</li>
					</ul>
				</div>
				
				
			</div>
		</div>

	</div>
	<script type="text/javascript">
		/* var name = "${userName}";
		var pid = "${pid}"; */
	</script>

	<%@ include file="/common/js-lib.jsp"%>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/js/dist/etoll/index.js"></script>
</body>
</html>