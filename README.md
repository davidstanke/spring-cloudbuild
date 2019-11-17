# spring-cloudbuild
Build a simple Spring Boot application with Google Cloud Build

## Method A: Building with Cloud Build
#### Build, test, and package application with Cloud Build
> prerequisites: 
>
> * the `gcloud` CLI is installed and configured
> * the active GCP project in gcloud has the Cloud Build API enabled

1. clone this repo and `cd` into it
2. run `gcloud builds submit`
3. (optional) configure a [Cloud Build trigger](https://cloud.google.com/cloud-build/docs/running-builds/create-manage-triggers)

#### Locally run the application created by Cloud Build
> _prerequisite: Docker is installed and running_

1. run `docker run gcr.io/$(gcloud config list --format 'value(core.project)' 2>/dev/null)/hellospring`

  _...you should see the GCP logo (as ASCII)_

## Method B: Building locally
> _prerequisite: Java version 8+ is available on the path (to confirm: run `java -version`)_

1. clone this repo and `cd` into it
1. run `./mvnw package`
1. run `java -jar target/hello-spring-1.0.0.jar`

  _...you should see the GCP logo (as ASCII)_