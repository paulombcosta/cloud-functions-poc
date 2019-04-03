deploy: destroy
	./gradlew shadowJar
	@echo deploys to serverless
	serverless deploy -v
destroy:
	serverless remove
enable-logging:
	aws cloudformation create-stack --stack-name logging --template-body file://$(shell pwd)/enable-logging.yml --capabilities CAPABILITY_IAM
