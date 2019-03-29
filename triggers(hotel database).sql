/*to calculate laundry total charge*/
delimiter //
create trigger laundry_totalling
after insert on Laundry_info
for each row
begin
    update Booking_info
    set Laundry_charge = Laundry_charge + new.Total_price where Booking_id = new.Booking_id;
end //
delimiter ;

/*to calculate dining total charge*/
delimiter //
create trigger dining_totalling
after insert on Dining_info
for each row
begin
	update Booking_info
	set Dining_charge = Dining_charge + new.Total_price where Booking_id = new.Booking_id;
end //
delimiter ;

/*to calculate salon total charge*/
delimiter //
create trigger salon_totalling
after insert on Salon_info
for each row
begin
    update Booking_info
    set Salon_charge = Salon_charge + new.Total_price where Booking_id = new.Booking_id;
end //
delimiter ;