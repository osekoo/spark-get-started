#!/bin/bash
docker compose down -v
docker compose up spark-worker -d
docker compose up spark-get-started-spark-client
docker compose down -v