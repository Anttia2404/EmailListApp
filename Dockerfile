# Bước 1: Chọn image Tomcat 10 / JDK 17
FROM tomcat:10.1-jdk17

# Bước 2: Copy thẳng file .war vào.
# Tomcat sẽ tự động giải nén và ưu tiên ROOT.war hơn thư mục ROOT mặc định.
# Tên file "EmailListApp.war" của bạn đã được xác nhận là đúng.
COPY dist/EmailListApp.war /usr/local/tomcat/webapps/ROOT.war