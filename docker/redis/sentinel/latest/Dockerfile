FROM redis:latest

EXPOSE 26379

# Environment

ENV SENTINEL_QUORUM 2
ENV SENTINEL_DOWN_AFTER 30000
ENV SENTINEL_FAILOVER 180000

# Sentinel Configuration

ADD sentinel.conf /etc/redis/sentinel.conf
RUN chown redis:redis /etc/redis/sentinel.conf


# Sentinel Entrypoint

#COPY sentinel-entrypoint.sh /usr/local/bin/
#RUN chmod +x /usr/local/bin/sentinel-entrypoint.sh

#ENTRYPOINT ["sentinel-entrypoint.sh"]

#CMD [ "redis-server", "/etc/redis/sentinel.conf", "--sentinel" ]
