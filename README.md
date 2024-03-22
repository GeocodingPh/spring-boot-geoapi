# Geo Coding API for Spring Boot

## How To Set Database

- Prerequisites:
  - Node
  - Yarn
  - Docker

- Clone `philippines-json-maps` repository
    ```sh
    git clone https://github.com/GeocodingPh/philippines-json-maps.git
    ```

- Run mongodb docker container
    ```sh
    docker-compose up -d
    ```

- Get ts package dependencies
    ```sh
    yarn install
    ```

- Combine geo json files
    ```sh
    yarn go combineJson
    ```

- Insert data into mongodb on docker
    ```sh
    yarn go insert <Resolution>
    ```
  - support resolution
    - hires (simplify 10%)
    - medres (simplify 1%)
    - lowres (simplify 0.1%)
  

