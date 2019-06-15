Quarkus MP
==============

Mostly Microprofile elements from quarkus, and other extensions, based on quarkus-quistarts: https://github.com/quarkusio/quarkus-quickstarts.


Configuration
---------------

Default is set to use in memory h2 databse, and no additional configuration is necessary.
 
To use Postgresql modify application.properties, install PostgreSQL server, run `psql` and execute:

```
create user quark with encrypted password 'quark';
CREATE DATABASE "quarkDB" WITH OWNER "quark" ENCODING 'UTF8';
```

`\q` to quit psql.


Endpoints
============

Hello
-----

```
http://localhost:8080/hello/greeting/john
```

mp-health
----------

```
http://localhost:8080/health
```

mp-config
----------

```
http://localhost:8080/configuration
```

hibernate-orm, jpa
------------------

insert John (GET for easier testing):

```
http://localhost:8080/quarkuser/john
```

list users:

```
http://localhost:8080/quarkuser
```


open-api
--------

openapi yaml:

```
http://localhost:8080/openapi
```

swagger-ui, only in dev mode (or add `quarkus.swagger-ui.always-include=true` to application.properties)

```
http://localhost:8080/swagger-ui
```


Lifecycle events
------------------

On application start and close print messages


Scheduler
---------

Simple output from "ScheduledTask" class every 10 seconds.


jwt security
-------------

Public access:

```
http://localhost:8080/secured/permit-all
```

Secured:

```
http://localhost:8080/secured/lotto/winners
http://localhost:8080/secured/roles-allowed
http://localhost:8080/secured/deny-all
http://localhost:8080/secured/winners
http://localhost:8080/secured/winners2
```


async jax-rs
-------------

```
http://localhost:8080/hello/async
```

```
http://localhost:8080/hello/async/greeting/mari
```


