#include <stdio.h>
// Global Variable Declarations
int no_of_processes, sum = 0;
int arrival_time[10], burst_time[10], completion_time[10],
    waiting_time[10], turnaround_time[10];
float total_turnaround_time, total_waiting_time;
// Function Definitions
void accept_user_input()
{
    // Accepting Processes with burst time and arrival time
    printf("Enter the no. of processes = ");
    scanf("%d", &no_of_processes);
    printf("Enter arrival time and burst time for each process : \n\n");
    for (int input_cntr = 0; input_cntr < no_of_processes; input_cntr++)
    {
        printf("Arrival time of process[%d] = ", input_cntr + 1);
        scanf("%d", &arrival_time[input_cntr]);
        printf("Burst time of process[%d] = ", input_cntr + 1);
        scanf("%d", &burst_time[input_cntr]);
        printf("\n\n");
    }
}
void calculate_completion_time()
{
    // Calculate completion time of process
    for (int completion_cntr = 0; completion_cntr < no_of_processes;
         completion_cntr++)
    {
        sum = sum + burst_time[completion_cntr];
        completion_time[completion_cntr] =
            completion_time[completion_cntr] + sum;
    }
}
void calculate_turnaround_time()
{
    // Calculate turnaround time
    for (int turnaround_cntr = 0; turnaround_cntr < no_of_processes;
         turnaround_cntr++)
    {
        // Formula -> Turnaround Time = Completion Time - Arrival Time
        turnaround_time[turnaround_cntr] =
            completion_time[turnaround_cntr] - arrival_time[turnaround_cntr];
        total_turnaround_time = total_turnaround_time +
                                turnaround_time[turnaround_cntr];
    }
}
void calculate_waiting_time()
{
    // Calculate waiting time
    for (int waiting_cntr = 0; waiting_cntr < no_of_processes;
         waiting_cntr++)
    {
        // Formula -> Waiting Time = Turnaround Time - Burst Time
        waiting_time[waiting_cntr] = turnaround_time[waiting_cntr] -
                                     burst_time[waiting_cntr];
        total_waiting_time = total_waiting_time + waiting_time[waiting_cntr];
    }
}
void display_output()
{
    printf("Naming Conventions: \n\n");
    printf("PID = Process ID\t AT = Arrival Time\t BT = Burst Time\n");
    printf("CT = Completion Time\t TAT = Turnaround Time\t WT = Waiting Time\n\n");
    printf("After Scheduling : \n\n");
    printf("PID\t AT\t BT\t CT\t TAT\t WT\t\n\n");
    for (int display_cntr = 0; display_cntr < no_of_processes; display_cntr++)
    {
        printf("P%d\t %d\t %d\t %d\t %d\t %d\n", display_cntr + 1,
               arrival_time[display_cntr], burst_time[display_cntr],
               completion_time[display_cntr], turnaround_time[display_cntr],
               waiting_time[display_cntr]);
    }
    printf("\n\nAverage Waiting Time = %f\n", total_waiting_time / no_of_processes);
    printf("\nAvergae Turnaround Time = %f\n", total_turnaround_time / no_of_processes);
}
int main(void)
{
    accept_user_input();
    calculate_completion_time();
    calculate_turnaround_time();
    calculate_waiting_time();
    display_output();
    return 0;
}