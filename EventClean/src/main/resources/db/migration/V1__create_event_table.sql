-- V1_create_event_table.sql
CREATE TABLE Events (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    identity_event VARCHAR(255) NOT NULL UNIQUE,
    start_time TIMESTAMP NOT NULL,
    finish_time TIMESTAMP NOT NULL,
    local_event VARCHAR(255) NOT NULL,
    capacity INTEGER NOT NULL,
    manager VARCHAR(100) NOT NULL,
    type VARCHAR(255) NOT NULL
);