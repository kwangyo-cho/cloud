#!/bin/sh

mkdir -p /etc/redis

chown redis:redis /etc/redis/sentinel.conf

exec "/usr/local/bin/docker-entrypoint.sh" "$@"
