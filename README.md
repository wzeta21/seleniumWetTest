# steep to excecute
2. docker-compose up -d chrome selenium-hub
3. docker-compose build automation-web
4. docker-compose up automation-web

docker-compose up -d --build
docker-compose down --remove-orphans
# excecute jenkins as admin
1. sudo cat /var/lib/jenkins/secrets/initialAdminPassword | docker exec automation-web cat /var/jenkins_home/secrets/initialAdminPassword