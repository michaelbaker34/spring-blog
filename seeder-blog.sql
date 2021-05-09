use luna_blog_db;

insert into post_details (history_of_post, is_awesome, topic_description) values
('History of Post 1', true, 'This post is about posts 1'),
('History of Post 2', true, 'This post is about posts 2'),
('History of Post 3', true, 'This post is about posts 3'),
('History of Post 4', true, 'This post is about posts 4');

insert into posts (title, body, post_details_id) values
('Post 1', 'Yadda yadda yadda 1', 1),
('Post 2', 'Yadda yadda yadda 2', 2),
('Post 3', 'Yadda yadda yadda 3', 3),
('Post 4', 'Yadda yadda yadda 4', 4);