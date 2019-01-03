FROM haproxy:1.7

#COPY haproxy.cfg /usr/local/etc/haproxy/haproxy.cfg

COPY haproxy-entrypoint.sh /haproxy-entrypoint.sh
RUN chmod +x /haproxy-entrypoint.sh

EXPOSE 6379
EXPOSE 9000

RUN apt-get update && apt-get install -y dos2unix

RUN dos2unix /haproxy-entrypoint.sh && apt-get --purge remove -y dos2unix && rm -rf /var/lib/apt/lists/*

ENTRYPOINT [ "/haproxy-entrypoint.sh"]

CMD [ "haproxy", "-f", "/usr/local/etc/haproxy/haproxy.cfg" ]
