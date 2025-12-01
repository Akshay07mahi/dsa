#  Date and Time Analysis Module
import datetime
import pandas as pd
import numpy as np

# Create a sample DataFrame with date strings
data = {
    'date': ['2024-01-01', '2024-02-15', '2024-03-20', '2024-04-25'],
    'value': [10, 20, 30, 40]
}

df = pd.DataFrame(data)
             
             
df['date'] = pd.to_datetime(df['date'])

# .dt to extract year, month, day, and weekday
df['year'] = df['date'].dt.year
df['month'] = df['date'].dt.month
df['day'] = df['date'].dt.day

df['weekday'] = df['date'].dt.day_name()
print("DataFrame with Date Components:\n", df)
# Filter rows for a specific month (e.g., March)
march_data = df[df['month'] == 3]
print("\nData for March:\n", march_data)
# Calculate the difference between dates
df['date_diff'] = df['date'] - df['date'].min()
print("\nDataFrame with Date Differences:\n", df)

#  Frequency Resampling
df.set_index('date', inplace=True)
monthly_data = df.resample('M').sum()
print("\nMonthly Resampled Data:\n", monthly_data)


#  filter by dates 
start_date = '2024-02-01'
end_date = '2024-03-31'

filtered_data = df.loc[start_date:end_date]
print("\nFiltered Data between 2024-02-01 and 2024-03-31:\n", filtered_data)

# filter by month 
february_data = df[df.index.month == 2]
print("\nData for February:\n", february_data)

# filter by year
year_2024_data = df[df.index.year == 2024]
print("\nData for the year 2024:\n", year_2024_data)

