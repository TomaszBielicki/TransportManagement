INSERT INTO transport (id, transport_id, capacity, delivery_date)
VALUES (1001, 'ewfd34f5g', 78.9, sysdate());
INSERT INTO transport (id, transport_id, capacity, delivery_date)
VALUES (1002, 'ewfd34f5g', 78.9, sysdate());


INSERT INTO orders (id, order_id, name, last_name, post_code, address, order_date, transport_id)
VALUES (2001, '3523425', 'OrderName', 'Tomasz', 'le11 5hy', 'loughborough', sysdate(), 1001);

INSERT INTO FURNITURE (id, furniture_id, name, capacity, orders_id)
VALUES (3001, 'fdbsdf43r5','sofa', 2.45, 2001);
INSERT INTO FURNITURE (id, furniture_id, name, capacity, orders_id)
VALUES (3002, 'fdbsdf43r5','pufa', 2.45, 2001);


