# spring-cloudbuild
Simple demo of building Spring with Google Cloud Build

### Using Cloud Build
#### Build, test, and package application with Cloud Build
_prerequisite: the `gcloud` CLI is installed and configured_
_prerequisite: the active GCP project in gcloud has the Cloud Build API enabled_

* `gcloud builds submit`

#### Locally run the application created by Cloud Build
_prerequisite: Docker is installed and running_

* `docker run gcr.io/$(gcloud config list --format 'value(core.project)' 2>/dev/null)/hellospring`

### (alt) Build a JAR and run locally (non-containerized)
_prerequisite: Java version 8+ is available on the path (to test: `java -version`)_

* `./mvnw package`
* `java -jar target/hello-spring-1.0.0.jar`
* _...you should see the GCP logo (as ASCII)_