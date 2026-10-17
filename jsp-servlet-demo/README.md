# jsp-servlet-demo

Bài thực hành Java Web: tạo trang hiển thị thời gian hệ thống bằng JSP và Servlet.

## Công nghệ
- Java 17
- Maven
- Jakarta Servlet 6.0 / JSP API 3.1
- Apache Tomcat 10.1+

## Cấu trúc
- `pom.xml`: cấu hình Maven và thư viện
- `src/main/java/com/codegym/HelloServlet.java`: Servlet tại `/hello`
- `src/main/webapp/index.jsp`: trang chủ hiển thị thời gian
- `src/main/webapp/WEB-INF/web.xml`: cấu hình ứng dụng web

## Đóng gói
Mở terminal tại thư mục có `pom.xml`, chạy:

```bash
mvn clean package
```

Khi thấy `BUILD SUCCESS`, file WAR được tạo tại `target/jsp-servlet-demo.war`.

## Chạy trên Tomcat
1. Cài Java 17, Maven và Apache Tomcat 10.1+.
2. Copy `target/jsp-servlet-demo.war` vào thư mục `webapps` của Tomcat.
3. Khởi động Tomcat:
   - Windows: chạy `bin\\startup.bat`
   - macOS/Linux: chạy `./bin/startup.sh`
4. Mở:
   - Trang chủ: http://localhost:8080/jsp-servlet-demo/
   - Servlet: http://localhost:8080/jsp-servlet-demo/hello

## Đưa mã nguồn lên GitHub (không cần VS Code)
1. Giải nén ZIP.
2. Vào GitHub, tạo repository mới tên `jsp-servlet-demo`.
3. Trong repository, chọn **Add file → Upload files**.
4. Kéo các file/thư mục dự án vào trang upload (nếu trình duyệt không nhận thư mục, tạo repository rồi dùng Git Bash/Terminal).
5. Bấm **Commit changes** và sao chép URL repository để nộp.

Không cần đưa thư mục `target/` lên GitHub; đó là thư mục Maven tạo ra khi build.
