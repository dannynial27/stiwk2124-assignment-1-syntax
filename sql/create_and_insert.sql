-- Create tables
CREATE TABLE IF NOT EXISTS roles (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     name VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS users (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    role_id BIGINT,
    FOREIGN KEY (role_id) REFERENCES roles(id)
    );

CREATE TABLE IF NOT EXISTS categories (
                                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                          name VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS products (
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        name VARCHAR(100) NOT NULL,
    description VARCHAR(255),
    price DECIMAL(10,2) NOT NULL,
    stock_quantity INT,
    image_url VARCHAR(255),
    category_id BIGINT,
    FOREIGN KEY (category_id) REFERENCES categories(id)
    );

-- Insert sample data
-- Insert roles
INSERT INTO roles (name, description) VALUES
                                          ('ADMIN', 'Administrator role with full access'),
                                          ('MANAGER', 'Manager role with limited access'),
                                          ('USER', 'Regular user role');

-- Insert users
INSERT INTO users (name, email, password, role_id) VALUES
                                                       ('Admin User', 'admin@example.com', 'admin123', 1),
                                                       ('Manager User', 'manager@example.com', 'manager123', 2),
                                                       ('Regular User', 'user@example.com', 'user123', 3);

-- Insert categories
INSERT INTO categories (name, description) VALUES
                                               ('Electronics', 'Electronic devices and accessories'),
                                               ('Clothing', 'Fashion items and apparel'),
                                               ('Home & Kitchen', 'Home appliances and kitchenware');

-- Insert products
INSERT INTO products (name, description, price, stock_quantity, image_url, category_id) VALUES
                                                                                            ('Smartphone', 'Latest smartphone with advanced features', 799.99, 50, 'smartphone.jpg', 1),
                                                                                            ('Laptop', 'High-performance laptop for work and gaming', 1299.99, 30, 'laptop.jpg', 1),
                                                                                            ('T-shirt', 'Comfortable cotton t-shirt', 19.99, 100, 'tshirt.jpg', 2),
                                                                                            ('Jeans', 'Durable denim jeans', 49.99, 75, 'jeans.jpg', 2),
                                                                                            ('Coffee Maker', 'Automatic coffee maker for home use', 89.99, 25, 'coffee-maker.jpg', 3),
                                                                                            ('Blender', 'High-speed blender for smoothies and soups', 59.99, 40, 'blender.jpg', 3);