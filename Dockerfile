# Bước 1: Chọn một "hộp" có sẵn Tomcat 10 và Java 17
# (Tomcat 10 tương thích với code jakarta.* của bạn)
FROM tomcat:10.1-jdk17

# Bước 2: (Tùy chọn) Xóa các ứng dụng mẫu của Tomcat cho sạch
RUN rm -rf /usr/local/tomcat/webapps/*

# Bước 3: Copy file .war đã build của bạn vào Tomcat
# Chúng ta đổi tên nó thành ROOT.war để nó chạy ở trang chủ (/)
# Thay "EmailListApp.war" bằng tên file .war của bạn nếu nó khác
COPY dist/EmailListApp.war /usr/local/tomcat/webapps/ROOT.war
