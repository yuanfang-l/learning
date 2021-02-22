<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>登录</title>
  <link rel="stylesheet" href="https://at.alicdn.com/t/font_1725516_8svgblor56.css">
  <style>

    body {

      display: flex;
      justify-content: center;
      align-items: stretch;
      height: 100vh;
      margin: 0vh;
      background-color: gray;

    }

    .login-wrapper {
      display: flex;
      flex-direction: column;
      justify-content: center;
      max-width: 400px;
      min-width: 350px;
      height: 450px;
      padding: 20px 10px;
      background-color: #ffffff60;
      border-radius: 6px;
    }

    form {
      display: flex;
      flex-direction: column;
      align-items: center;
    }

    .iconfont {
      font-size: 22px;
      font-style: oblique;
    }

    .login-inputContainer {
      display: flex;
      flex-direction: column;
      align-items: center;
    }

    .login-input {
      display: flex;
      margin-top: 40px;
    }

    .login-input input {
      margin-left: 20px;
      padding: 5px;
      border: none;
      border-bottom: 1.5px solid rgba(85, 85, 85, 0.774);
    }

    input[type="submit"] {
      width: 200px;
      height: 40px;
      margin-top: 50px;
      border-with: 5px;
      border-style:dotted;
      background-color: #6AAFE6;
      color: black;
      font-size: 20px;
      letter-spacing: .2em;
      cursor: pointer;
      margin-left: 10%;
    }
    .login-wrapper h2 {
      margin: 0 0 30px 20%;
    }

  </style>
</head>
<body>

<div class="login-wrapper">

  <h2 >登录</h2>
  <form action="${pageContext.request.contextPath}/login" method="post">
    <div class="login-inputContainer">
      <div class="login-input">
        <label for="username" class="iconfont icon-user" ></label>
        <input type="text" id="username" name="username" placeholder="请输入用户名">
      </div>
      <div class="login-input">
        <label for="password" class="iconfont icon-lock"></label>
        <input type="password" id="password" name="password" placeholder="请输入密码">
      </div>
    </div>
    <input type="submit" value="登录">
  </form>
  <span style="color: red; font-size: 18px; margin: 10px auto;">${tip}</span>
</div>
</body>
</html>