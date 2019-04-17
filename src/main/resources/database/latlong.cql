CREATE KEYSPACE socketio WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'}  AND durable_writes = true;

CREATE TABLE socketio.latlong (
    latlongid uuid PRIMARY KEY,
    currenttime timestamp,
    latitude double,
    longitude double
);